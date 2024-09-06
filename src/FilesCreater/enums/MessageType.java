package FilesCreater.enums;

import FilesCreater.contrast.Notification;

public enum MessageType implements Notification {

    SMS {
        @Override
        public void process() {
            System.out.println("Sending SMS to customers");
        }
    },

    EMAIL {
        @Override
        public void process() {
            System.out.println("Sending EMAIL to customers");
        }
    },

    PUSH_NOTIFICATION {
        @Override
        public void process() {
            System.out.println("Sending PUSH_NOTIFICATION to customers");
        }
    }
}
