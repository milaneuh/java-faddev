package Battle;

public class Choice {
    enum UserChoice {
        SOLO("1"), NoPlayer("2");

        public String value;

        private UserChoice(String value) {
            this.value = value;
        }
    }
}
