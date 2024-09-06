package channel;

abstract public class Country {

    public String title = "default title";

      public void setTitle(String title){
          this.title = title;
      }

      public  String getTitle () throws IllegalAccessException {
          if(this.title == null)
              throw new IllegalAccessException("Title is null");

          return this.title.toUpperCase();
      }

      abstract  String setMessage(String message);
      abstract  String getMessage();



}
