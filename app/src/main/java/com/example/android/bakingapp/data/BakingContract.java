package com.example.android.bakingapp.data;

import android.net.Uri;
import android.provider.BaseColumns;

public class BakingContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.bakingapp";

    private static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_RECIPES = "recipes";
    public static final String PATH_INGREDIENTS = "ingredients";
    public static final String PATH_STEPS = "steps";

    public static final class BakingEntry implements BaseColumns {
        public static final Uri RECIPE_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_RECIPES)
                .build();

        public static final Uri INGREDIENTS_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_INGREDIENTS)
                .build();

        public static final Uri STEPS_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_STEPS)
                .build();

        public static final String RECIPE_TABLE = "recipes";
        public static final String COLUMN_RECIPE_NAME = "name";
        public static final String COLUMN_SERVINGS = "servings";
        public static final String COLUMN_IMAGE = "image";

        public static final String INGREDIENTS_TABLE = "ingredients";
        public static final String RECIPE_INGREDIENT = "recipeIngredient";
        public static final String COLUMN_INGREDIENTS = "ingredient";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_MEASURE = "measure";

        public static final String STEPS_TABLE = "steps";
        public static final String RECIPE_STEP = "recipeStep";
        public static final String COLUMN_SHORT_DESCRIPTION = "shortDescription";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_VIDEO_URL = "videoURL";
        public static final String COLUMN_THUMBNAIL_URL = "thumbnailURL";
        // Note that step number in this case refers to JSON identifier of "id"
        public static final String COLUMN_STEP_ID = "stepId";
    }
}
