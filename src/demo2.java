public class demo2 {
    public static void main(String[] args) {

        // This is the variable which is to be broken. Currently maximum can be set to max 5 characters which can be any from the Array alphabetsArray
        String password = "admin";

        // This variable stores the found password found
        String brokenpassword = "";

        // If you need more characters to break then add more String characters like below i.e. String six_characters = "";
        String two_characters = "";
        String three_characters = "";
        String four_characters = "";
        String five_characters = "";

        // Only these characters will be iterated over. If you want to add more to the attack then add more single characters of type string to add in the brute-force attack
        String[] alphabetsArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "!"};

        // Variable for breaking nested loops when password is found
        boolean flag = false;

        // Main Loop
        for (String one : alphabetsArray) {
            firstblock:
            {
                System.out.println(one);
                if (one.equals(password)) {
                    System.out.println("Password found!" + " It is " + one);
                    brokenpassword = one;
                    break;
                } else {
                    System.out.println("Password not found");
                    for (String two : alphabetsArray) {
                        secondblock:
                        {
                            two_characters = one + two;
                            System.out.println(two_characters);
                            if (two_characters.equals(password)) {
                                System.out.println("Password found!" + " It is " + two_characters);
                                brokenpassword = two_characters;
                                flag = true;
                                break firstblock;
                            } else {
                                System.out.println("Password not found");
                                for (String three : alphabetsArray) {
                                    thirdblock:
                                    {
                                        three_characters = one + two + three;
                                        if (three_characters.equals(password)) {
                                            System.out.println(three_characters);
                                            System.out.println("Password found!" + " It is " + three_characters);
                                            brokenpassword = three_characters;
                                            flag = true;
                                            break secondblock;
                                        } else {
                                            System.out.println(three_characters);
                                            System.out.println("Password not found");
                                            for (String four : alphabetsArray) {
                                                fourthblock:
                                                {
                                                    four_characters = one + two + three + four;
                                                    if (four_characters.equals(password)) {
                                                        System.out.println(four_characters);
                                                        System.out.println("Password found!" + " It is " + four_characters);
                                                        brokenpassword = four_characters;
                                                        flag = true;
                                                        break thirdblock;
                                                    } else {
                                                        System.out.println(four_characters);
                                                        System.out.println("Password not found");
                                                        for (String five : alphabetsArray) {
                                                            fifthblock:
                                                            {
                                                                five_characters = one + two + three + four + five;
                                                                if (five_characters.equals(password)) {
                                                                    System.out.println(five_characters);
                                                                    System.out.println("Password found!" + " It is " + five_characters);
                                                                    brokenpassword = five_characters;
                                                                    flag = true;
                                                                    break fifthblock;
                                                                } else {
                                                                    System.out.println(five_characters);
                                                                    System.out.println("Password not found");

                                                                    // Add sixth-character iteration if more needed

                                                                }
                                                            }
                                                            if (flag)
                                                                break;
                                                        }
                                                        if (flag)
                                                            break;
                                                    }
                                                    if (flag)
                                                        break;
                                                }
                                                if (flag)
                                                    break;
                                            }
                                            if (flag)
                                                break;
                                        }
                                        if (flag)
                                            break;
                                    }
                                    if (flag)
                                        break;
                                }
                                if (flag)
                                    break;
                            }
                            if (flag)
                                break;
                        }
                        if (flag)
                            break;
                    }
                    if (flag)
                        break;
                }
                if (flag)
                    break;
            }
            if (flag)
                break;
        }
        System.out.println(brokenpassword);
        }
    }