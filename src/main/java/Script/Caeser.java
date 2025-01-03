/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Script;

/**
 *
 * @author Admin
 */
public class Caeser {
    
    public static String encrypt (String plaintext,int key) {
        String ciphertext = new String();
        for (char c: plaintext.toCharArray()) {
            if (Character.isLetter(c)) {             
                char n = (c >= 'A' && c <= 'Z') ? 'A' : 'a';
                // nếu biến n nằm trong khoảng của chữ in thì chả về biến n chũ in
                // còn ko đúng thì chả về chữ thường
                ciphertext += (char) ((c - n + key) % 26 + n);// thực hiện phép chia lấy dư 
            }
            else ciphertext += c;
        }

        return ciphertext;
    }
    public static String decrypt (String ciphertext,int key){
        //tận dụng lại hàm mã hóa truyền vào hàm mã hóa với số key còn lại, 
        //khi đó hàm mã hóa sẽ mã hóa tiếp và quay lại kí tự ban đầu theo chiều kim đồng hồ
        return encrypt (ciphertext, 26 - key);
    }
}
