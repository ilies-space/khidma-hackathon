package com.hackathon.khidma27;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // CraftMan Slider TEST
    GridView gridview ;
    //profile images test :
    int[] profileImage = {
            R.drawable.man0,R.drawable.man1,R.drawable.ma2 ,
            R.drawable.ma3,R.drawable.man4,R.drawable.man5,
            R.drawable.man0,R.drawable.man1,R.drawable.ma2,
            R.drawable.ma3,R.drawable.man4,R.drawable.man5

    };

    //repairman names test :
    String[] namesList = {
            "عبد العزيز", "عبد الله مبارك", "محمد أحمد",
            "أكرم مهند", "فهد عبد الله", "مسعود ساعدي",
            "عبد العزيز", "عبد الله مبارك", "محمد أحمد",
            "أكرم مهند", "فهد عبد الله", "مسعود ساعدي"



    };

    //repairman jobtitleTest test :
    String[] joblist = {
            "فني موبايل", "فني موبايل", "فني موبايل",
            "فني موبايل", "فني موبايل", "فني موبايل",
            "فني موبايل", "فني موبايل", "فني موبايل",
            "فني موبايل", "فني موبايل", "فني موبايل"



    };

    //evaluation  test :
    int[] evaluation = {
            5,3,5,
            2,4,5,
            5,3,5,
            2,4,5,
    };

    //repairman Distance test :
    String[] distances = {
            "2", "45", "120",
            "90", "55", "4.5",
            "2", "45", "120",
            "90", "55", "4.5",
    };

    // CraftMan Slider TEST

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialisation :

        gridview = findViewById(R.id.gridview);

        //Loading Images :
        CustomAdapter customAdapter = new CustomAdapter();
        gridview.setAdapter(customAdapter);


        //When Click On Image :
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                CraftManModel craftManModel = new CraftManModel(profileImage[i],namesList[i],joblist[i],evaluation[i],distances[i]);
                SecondActivity(craftManModel);


            }
        });

    }

    //On item selected :
    public void SecondActivity(CraftManModel craftManModel) {

        Intent myIntent = new Intent(this, CraftManDetails.class);
        myIntent.putExtra("craftManModel",  craftManModel);
        this.startActivity(myIntent);
        //store selected data to an object to send it to the sendOrder Activity

    }





    //gridView Adapter :
    //Class Of Custom Adapter :
    private class CustomAdapter  extends BaseAdapter {


        @Override
        public int getCount() {
            return namesList.length ;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("SetTextI18n")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            @SuppressLint({"InflateParams", "ViewHolder"}) View view1 = getLayoutInflater().inflate(R.layout.row_repairman_cardview,null);

            ImageView image = view1.findViewById(R.id.images);
            image.setImageResource(profileImage[i]);

            TextView name = view1.findViewById(R.id.remarman_nameTv);
            name.setText(namesList[i]);

            TextView joblists = view1.findViewById(R.id.remarman_jobTv);
            joblists.setText(joblist[i]);

            TextView distance = view1.findViewById(R.id.remarman_locationTv);
            distance.setText(distances[i]+" كم");

            //rating
            ImageView ratings = view1.findViewById(R.id.ratingImage);
            switch (evaluation[i]){
                case 1 :
                    ratings.setImageResource(R.drawable.rating1);
                    break;
                case 2 :
                    ratings.setImageResource(R.drawable.rating2);
                    break;
                case 3 :
                    ratings.setImageResource(R.drawable.rating3);
                    break;
                case 4 :
                    ratings.setImageResource(R.drawable.rating4);
                    break;
                case 5 :
                    ratings.setImageResource(R.drawable.rating5);
                    break;


            }


            return view1;
        }


    }
}
