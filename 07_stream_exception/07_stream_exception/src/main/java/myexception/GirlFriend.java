package myexception;

public class GirlFriend {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null != name && name.length() > 6) {
            throw new NameFormatterException(name + "不能太长");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
