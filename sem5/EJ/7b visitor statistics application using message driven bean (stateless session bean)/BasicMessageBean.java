package p1;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/Queue")
})
public class BasicMessageBean implements MessageListener {

    @EJB
    VisitorStatBean vs;

    @Resource
    private MessageDrivenContext mdc;

    public BasicMessageBean() {
    }

    @Override
    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage) {
                TextMessage msg = (TextMessage) message;
                vs.addVisitor(msg.getText());
            }
        } catch (JMSException e) {
            mdc.setRollbackOnly();
        }
    }
}
