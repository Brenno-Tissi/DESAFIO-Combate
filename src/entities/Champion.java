package entities;

public class Champion {

	String name;
	public int life;
	int attack;
	int armor;
	
	public Champion(String name1, int life1, int attack1, int armor1) {
		this.name = name1;
		this.life = life1;
		this.attack = attack1;
		this.armor = armor1;
		
	}
	
	public void takeDamage(int champion) {
		int effectiveDamage = champion - this.armor;       		
          
        if (effectiveDamage < 1) {
            effectiveDamage = 1;
        }
        
        this.life -= effectiveDamage;
        if (this.life < 0) {
            this.life = 0;
        }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String status () {
		if (this.life == 0) {
            return this.name + ": 0 de vida (morreu)";
        } else {
            return this.name + ": " + this.life + " de vida";
        }
    }

	
}
