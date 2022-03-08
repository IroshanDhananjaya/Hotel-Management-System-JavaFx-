package view.tm;

/**
 * @author : Dhananjaya
 * @since : 0.0.1
 **/
public class RoomTM {
        private String roomNumber;
        private String roomType;
        private String acType;
        private String perNight;
        private String telephone;

        public RoomTM() {
        }
        public RoomTM(String  roomNumber, String roomType, String acType, String perNight, String  telephone) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.acType = acType;
            this.perNight = perNight;
            this.telephone = telephone;
        }

        public String  getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(String  roomNumber) {
            this.roomNumber = roomNumber;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public String getAcType() {
            return acType;
        }

        public void setAcType(String acType) {
            this.acType = acType;
        }

        public String  getPerNight() {
            return perNight;
        }

        public void setPerNight(String  perNight) {
            this.perNight = perNight;
        }

        public String  getTelephone() {
            return telephone;
        }

        public void setTelephone(String  telephone) {
            this.telephone = telephone;
        }


}
