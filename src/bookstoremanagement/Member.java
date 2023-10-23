package bookstoremanagement;
import java.util.*;
/**
 *
 * @author alyssaday
 */
public class Member {
    
    private String name;
    private String phoneNumber;
    private String email;
    private boolean premiumMember;
    static double premiumFee;

    
    
    public Member(String memberName, String memberPhone, String memberEmail, boolean isPremiumMember) {
        this.name = memberName;
        this.phoneNumber = memberPhone;
        this.email = memberEmail;
        this.premiumMember = isPremiumMember;
        
    }
   
    
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean isPremiumMember) {
        this.premiumMember = isPremiumMember;
    }

    public static double getPremiumFee() {
        return premiumFee;
    }

    public static void setPremiumFee(double premiumFee) {
        Member.premiumFee = premiumFee;
    }
    
    
}
