class Voice{
    Animal[] animal= new Animal[5];
    void prepareVoice(){
        animal[0]= new Cow();
        animal[1]= new Goat();
        animal[2]= new Lion();
        animal[3]= new Tiger();
        animal[4]= new Dog();
        hear(animal);
    }
    public void hear(Animal [] animal){
        for(int i=0;i<5;i++)
        {
            animal[i].makeVoice();
        }
    }
}