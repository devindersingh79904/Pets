package com.example.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

        private PetContract(){

        }

        public static final class PetEntry implements BaseColumns {

            public final static String TABLE_NAME = "pets";

            public final static String _ID = BaseColumns._ID;
            public final static String COLUMN_PET_NAME = "name";
            public final static String COLUMN_PET_BREED = "breed";
            public final static String COLUMN_PET_GENDER = "gender";
            public final static String COLUMN_PET_WEIGHT = "weight";


            public final static int GENDER_UNKNOWN = 0;
            public final static int GENDER_MALE = 1;
            public final static int GENDER_FEMALE = 2;

        }
}
