
public class p1
{

        private double radius;

        public p1()
        {
            radius = 1;
        }
        public p1(double radius)
        {
            this.radius = radius;
        }
        public double getArea()
        {
            return 22*radius*radius/7;
        }
        public double getPerimeter()
        {
            return 2*22*radius/7;
        }

}

