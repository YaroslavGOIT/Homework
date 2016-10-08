package Homework.Module6;

public class Main {
    public static void main(String[] args) {
        UserUtils x=new UserUtils();
        User us1=new User(77452654L,"Clarc","Steven",645,23960);
        User us2=new User(75230574L,"Nazar","Ruslan",367,23560);
        User us3=new User(77452654L,"Clarc","Steven",645,23960);
        User us4=new User(47836256L,"Vadim","Kirichenko",826,63140);
        User us5=new User(30668362L,"Vasa","Pupkin",205,146990);
        User[] users=new User[]{us1,us2,us3,us4,us5};

        users=UserUtils.uniqueUsers(users);
        lop(UserUtils.paySalaryToUsers(users));
        lop(x.usersWithConditionalBalance(users,63140));

        lop(UserUtils.uniqueUsers(users));
        long[] userId=UserUtils.getUsersId(users);
        for(long id:userId) System.out.println(id);
    }
    private static void lop(User[] users){
        for (int i=0;i<users.length;i++) {
            System.out.println(users[i]);
        }
        System.out.println("=========================================================================\n");
    }
}