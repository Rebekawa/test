class TestYourself {
  public static void main(String args[]) {
    
   java.util.Scanner in = new java.util.Scanner(System.in);
  System.out.println("Welcome to the 'Are you a social media addict?' quiz");
  System.out.println("*************************************");
  System.out.println("Question 1");
  System.out.println("—————");
  System.out.println("How many times per day do you refresh your facebook file?");
  System.out.println("1. 0, I don't have facebook");
  System.out.println("2. 1 or 2 times per day");
  System.out.println("3. between 3 and 10 times per day");
  System.out.println("4. More than 10 time per day");
  System.out.println("Please choose an answer:");
  int a = in.nextInt();
 if (a == 1){
   a = 1;
  }
  else if (a == 2){
   a = 10;
  }
  else if (a == 3){
   a = 50;
  }
  else (a == 4){
   a = 100;
  }
  System.out.println("Question 2");
  System.out.println("——————————");
  System.out.println("What is your first reaction when you see something beautiful?");
   System.out.println("1. You are just watching it and enjoying");
  System.out.println("2. You take a picture to keep a souvenir");
  System.out.println("3. You are sharing a post about it");
  System.out.println("4. You are taking a picture and directly post it on Social medias");
  System.out.println("Please choose an answer:");
  int b = in.nextInt();
 if (b == 1){
   b = 1;
  }
  else if (b == 2){
   b = 10;
  }
  else if (b == 3){
   b = 50;
  }
  else (b == 4){
   b = 100;
  }
  System.out.println("Question 3");
  System.out.println("——————————");
  System.out.println("How do you feel when you don't have an internet connexion?");
  System.out.println("1. You don't care, who needs internet to have fun?");
  System.out.println("2. You feel that something is missing but you can handle it");
  System.out.println("3. You feel very bad and you are trying to find any connexion");
  System.out.println("4. You feel very bad and you are even ready to ask a stranger his phone");
  System.out.println("Please choose an answer:");
  int c = in.nextInt();
  if (c == 1){
   c = 1;
  }
  else if (c == 2){
   c = 10;
  }
  else if (c == 3){
   c = 50;
  }
  else (c == 4){
   c = 100;
  }
  System.out.println("Question 4");
  System.out.println("——————————");
  System.out.println("You are meeting someone, what is the first thing you are doing when you leave?");
  System.out.println("1. Nothing");
  System.out.println("2. I talk about him/her to my friends");
  System.out.println("3. I text him/her");
  System.out.println("4. I check his/her facebook/instagram profile");
  System.out.println("Please choose an answer:");
  int d = in.nextInt();
  if (d == 1){
   d = 1;
  }
  else if (d == 2){
   d = 10;
  }
  else if (d == 3){
   d = 50;
  }
  else (d == 4){
   d = 100;
  }
  System.out.println("Question 5");
  System.out.println("——————————");
  System.out.println("How many hours more are you staying awake because of social media?");
  System.out.println("1. I don't use social media");
  System.out.println("2. I don't use social media before sleeping");
  System.out.println("3. Between 0 and 1 hour");
  System.out.println("4. More than 1 hour");
  System.out.println("Please choose an answer:");
  int e = in.nextInt();
  if (e == 1){
   e = 1;
  }
  else if (e == 2){
   e = 10;
  }
  else if (e == 3){
   e = 50;
  }
  else (e == 4){
   e = 100;
  }
  int sum;
  sum = a+b+c+d+e;
  if (sum >= 500){
   System.out.println("Your are a social media addict");
   System.out.println("You can't live without a computer or a phone next to you");
   System.out.println("Maybe you should try to enjoy without posting it?");
   
  }
  else if ((sum >= 250) && (sum < 500)){
   System.out.println("70% addicted to social media!");
   System.out.println("You definetly enjoy social media!");
   System.out.println("But just one week of detox and you will not need it anymore!");

  }
  else if ((sum >= 50) && (sum < 250)){
   System.out.println("50% addicted to social media!");
   System.out.println("Like most of the people you like spending time on social medias.");
   System.out.println("But you don't need it to enjoy!");
   System.out.println("You prefer the real human contact and to meet your friends!");
   
  }
  else ((sum >= 5) && (sum < 50)){
   System.out.println("You are not a social media addict!");
   System.out.println("You can enjoy without thinking what your friends will think about it.");
   System.out.println("Your time is precious and you don't want to lose it!");
   
 
 }
  }
}