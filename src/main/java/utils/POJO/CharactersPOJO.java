package utils.POJO;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharactersPOJO implements Serializable {
	private String birthday;
	private String img;
	private List<Object> better_call_saul_appearance;
	private List<String> occupation;
	private List<Integer> appearance;
	private String portrayed;
	private String name;
	private String nickname;
	private int char_id;
	private String category;
	private String status;

	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	public String getBirthday(){
		return birthday;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setBetterCallSaulAppearance(List<Object> betterCallSaulAppearance){
		this.better_call_saul_appearance = betterCallSaulAppearance;
	}

	public List<Object> getBetterCallSaulAppearance(){
		return better_call_saul_appearance;
	}

	public void setOccupation(List<String> occupation){
		this.occupation = occupation;
	}

	public List<String> getOccupation(){
		return occupation;
	}

	public void setAppearance(List<Integer> appearance){
		this.appearance = appearance;
	}

	public List<Integer> getAppearance(){
		return appearance;
	}

	public void setPortrayed(String portrayed){
		this.portrayed = portrayed;
	}

	public String getPortrayed(){
		return portrayed;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getNickname(){
		return nickname;
	}

	public void setCharId(int charId){
		this.char_id = charId;
	}

	public int getCharId(){
		return char_id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"CharactersDTO{" + 
			"birthday = '" + birthday + '\'' + 
			",img = '" + img + '\'' + 
			",better_call_saul_appearance = '" + better_call_saul_appearance + '\'' +
			",occupation = '" + occupation + '\'' + 
			",appearance = '" + appearance + '\'' + 
			",portrayed = '" + portrayed + '\'' + 
			",name = '" + name + '\'' + 
			",nickname = '" + nickname + '\'' + 
			",char_id = '" + char_id + '\'' +
			",category = '" + category + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}