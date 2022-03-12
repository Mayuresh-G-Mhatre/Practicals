class demo {
    final float PI = 3.14f;

    void show() {
        System.out.println("Area of circle: ");
    }
}

class P5A extends demo {
    float r = 5.0f;

    void area() {
        System.out.println(PI*r*r);
    }
    
    public static void main(String[] args) {
        P5A p = new P5A();
        p.show();
        p.area();
    }
}
