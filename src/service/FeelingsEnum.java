package service;

public enum FeelingsEnum {
    OUTRAGED {
        public String get() {
            return "Возмущен Крайне";
        }
    },
    IMPRESSED {
        public String get() {
            return "Впечатлен";
        }
    },
    SLEEPING {
        public String get() {
            return "Спит Сильно";
        }
    },
    HOPEFUL {
        public String get() {
            return "Надеется Втайне";
        }
    },
    NoneFeelings {
        public String get() {
            return "На Расслабоне На Чилле";
        }
    };

    public abstract String get();
}
