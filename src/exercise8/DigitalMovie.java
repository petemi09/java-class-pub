package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie
 * MediaLIbrary code 2
 * @author yasiro01
 */
public class DigitalMovie extends Movie {
  private String service;
  
    public DigitalMovie(String service, String director, int releaseYear, long id, String title) {
    super(director, releaseYear, id, title, 1);
    this.service = service;
    }

  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    service = service;
  }
  
  @Override
  public String getInfo() {
     return title + " by " + director + " can find at " + service + ", " + releaseYear;
  }


  
}
