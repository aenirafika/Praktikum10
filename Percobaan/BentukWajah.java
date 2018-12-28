package Praktikum10.Percobaan;

public class BentukWajah {
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}

class Senyum extends BentukWajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return("Tertawa karena gembira\n");
    }
}

class Marah extends BentukWajah{
    public String respons(){
        return("Kemarahan disebabkan bertangkar\n");
    }
}

class Sedih extends BentukWajah{
    public String respons(){
        return("Sedih disebabkan Cemburu\n");
    }
}
