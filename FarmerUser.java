package model.Farmer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class FarmerUser {
        int id;//for farmer either provide a guide line or just return what the user enters adding fr to the front and the buyer by
        String userName;//no same userName
        String name;
        String location;
        String email;
        String password;
        int phoneNumber;

        public FarmerUser(int id,String userName, String name,String location, String email,int phoneNumber){
            this.id=id;
            this.userName=userName;
            this.name=name;
            this.location=location;
            this.email=email;
            this.password=password;
            this.phoneNumber=phoneNumber;
        }
        public String setEmail(){
            String regex="^[A-Za-z0-9_+-]+@[A-Za-z0-9]+//.[A-Za-z]{2,}$";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(email);
            boolean isMatch=matcher.find();
            if(isMatch){
                this.email=email;
                return email;
            }
            else{
                System.out.println("invalid email!");
                return "";
            }
        }
        public String setPassword(){
            String regex="[A-Za-z][0-9][_+-@#$%^&*!]";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(password);
            boolean isMatch=matcher.find();
            if (isMatch){
                this.password=password;
                return password;
            }
            else{
                System.out.println("invalid password!");
                return"";
//when u ask the user to enter the password and the email specially the password also provide the criterion for each
            }
        }
        public int setPhoneNumber() {
            if (String.valueOf(this.phoneNumber).length()!=10) {
                System.out.println("invaid phone number");
                return 0;
            } else {
                return this.phoneNumber;
            }
        }
        public String setName(){
            return this.name;
        }
        public int setid(){
            return this.id;
        }
        public String setUserName(){
            return this.userName;
        }
        public String location(){
            return this.location;
        }
    }



