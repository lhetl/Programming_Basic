package class_Practice_Thursday.class5_18;
class quiz1 {
        private int volume;
        public void setVolume(int level) {volume = level;};
        public int getVolume() {return volume;}
        public static void main(String[] args) {
            quiz1 bose = new quiz1();
            bose.volume = 50;
            //bose.setVolume(50);
            int vol = bose.getVolume();
        }

};
