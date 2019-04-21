package com.example.gungmayun.the_avengers;

import java.util.ArrayList;

public class AvengersData {
    public ArrayList<String> getmNames() {return mNames;}
    public ArrayList<String> getmImageUrls() {return mImageUrls;}
    public ArrayList<String> getmNameRemarks() {return mNameRemarks;}
    public ArrayList<String> getmActors() {return mActor;}
    public ArrayList<String> getmDescriptions() {return mDescription;}

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNameRemarks = new ArrayList<>();
    private ArrayList<String> mActor = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();

    void initAvengersData(){
        //Captain America
        mNames.add("Captain America");
        mImageUrls.add("https://pm1.narvii.com/6788/8218b20754e0047b797a9461a66bc5319a71b798v2_hq.jpg");
        mNameRemarks.add("Steve Rogers");
        mActor.add("Chris Evans");
        mDescription.add("\n \n Steve Rogers’ forthright attitude and positive disposition has attracted a select group of people into his inner circle of friends. His longest companion is James Buchanan “Bucky” Barnes, who Rogers met in his Hell’s Kitchen neighborhood in New York and formed a close friendship with. Despite Barnes’ enlistment in the Army and Rogers’ career as Captain America during the war, the two found each other and united to form a solid battlefront against the Axis. When Barnes seemingly fell to his death, Steve Rogers felt as if a brother had been taken from him.");

        //Iron Man
        mNames.add("Iron Man");
        mImageUrls.add("https://pm1.narvii.com/6788/535603983f414c12dfedc62b0175025236a6c09cv2_hq.jpg");
        mNameRemarks.add("Tony Stark");
        mActor.add("Robert Downey, Jr.");
        mDescription.add("\n \n Iron Man’s armor provided a complete working environment for its user, including enhanced strength, closed air systems, data input, communications, flight, defense systems, and offensive weaponry such as missiles, lasers, and so-called “repulsor” technology. Stark never stops in his advancement of his armor designs, and at one time created multiple versions, each one of them with a specialized use. The armor has also become lighter and more flexible since the first incarnation, allowing Stark to “suit up” in mere seconds and be immediately ready for action.\n" +
                "\n" +
                "Stark’s latest suit was destroyed in battle with the tyrant Thanos, but while in use sported maximum thrust for flight, new offensive weapons, and nanotechnology that allowed near instantaneous application.\n");

        //Thor
        mNames.add("Thor");
        mImageUrls.add("https://pm1.narvii.com/6788/ec4968a8efba7d3a42feef0387ac9e2297d1ffd3v2_hq.jpg");
        mNameRemarks.add("Thor");
        mActor.add("Chris Hemsworth");
        mDescription.add("\n \n Born 1500 years ago to Odin and Frigga, the king and queen of fabled Asgard, Thor grew into a mighty warrior and protector of his home and people. Thought to be rash and even reckless by his father, Thor nevertheless looked forward to the day of his ascension to the throne. But, his adoptive brother Loki schemed in private to ensure that day never arrived. He manipulated Thor into attacking the Frost Giants, legendary adversaries of the Asgardians and Loki’s people, and Odin—hoping to teach his son humility—divested Thor of his magic hammer Mjolnir and banished him to Midgard, the realm also known as Earth.");

        //Hulk
        mNames.add("Hulk");
        mImageUrls.add("https://pm1.narvii.com/6788/90e6efe7810aee26bbaee10a56a2acdfa7a028d4v2_hq.jpg");
        mNameRemarks.add("Bruce Banner");
        mActor.add("Mark Ruffalo");
        mDescription.add("\n \n Bioscience genius Dr. Bruce Banner focused his major studies on the effects of gamma radiation on humans, working alongside Dr. Betty Ross at a Virginia University lab. Dr. Ross’ father, General “Thunderbolt” Ross of the U.S. Army, channeled Banner’s work into a program to develop weapons for the military, unbeknownst to both doctors. When Banner decided to test what he learned on himself, he triggered a fantastic transformation in himself that resulted in an immense, hulking figure fueled by his own rage.");

        //Black Widow
        mNames.add("Black Widow");
        mImageUrls.add("https://pm1.narvii.com/6788/b485aa79dadaecc417ca303d5161cecfbd44b737v2_hq.jpg");
        mNameRemarks.add("Natasha Romanoff");
        mActor.add("Scarlet Johansson");
        mDescription.add("\n \n Natasha Romanoff was trained from a young age to cultivate a very specific set of skills in a Russian facility called the Red Room. There she honed the skills that would turn her into a human warrior who continues to stand shoulder-to-shoulder with super soldiers, Asgardians and people in armored suits. However, she eventually eschewed her KGB masters, switched allegiances and began working for the good guys.");

        //Winter Soldier
        mNames.add("Winter Soldier");
        mImageUrls.add("https://pm1.narvii.com/6788/3e1e4584ad711ab80fbbf9eb5bb8b90d6f21ae72v2_hq.jpg");
        mNameRemarks.add("Bucky Barnes");
        mActor.add("Sebastian Stan");
        mDescription.add("\n \n James Buchanan “Bucky” Barnes grew up in Brooklyn with the scrawny Steve Rogers. The two became die-hard friends with Barnes sometimes looking out for Rogers who, though small, always stood up for what he thought was right. Barnes even offered for Rogers to come stay with him and his family after Steve’s mother passed away.");
    }
}