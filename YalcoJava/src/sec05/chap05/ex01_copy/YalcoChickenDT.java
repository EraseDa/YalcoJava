package sec05.chap05.ex01_copy;

import sec05.chap05.ex01.YalcoChicken;

public class YalcoChickenDT extends YalcoChicken {
    //얄코치킨DT는 얄코치킨을 상속받음.
        private boolean driveThruOpen = true;

        public YalcoChickenDT(String name) {
            super(name); // 다음 예제에서 다룰 것
        }

        public void setDriveThruOpen(boolean driveThruOpen) {
            this.driveThruOpen = driveThruOpen;
        }

        public void takeDTOrder () {
            System.out.printf(
                    "%d호 %s점 드라이브스루 주문 %s%n",
                    n, name,
                    (driveThruOpen ? "받음" : "불가")
            );
        }
}
