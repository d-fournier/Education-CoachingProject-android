package fr.sims.coachingproject.util;

/**
 * Created by dfour on 10/02/2016.
 */
public class Const {

    public static class SharedPref {
        public final static String SHARED_PREF_NAME = "CoachingProjectSharedPref";

        public final static String CURRENT_USER_ID = "CURRENT_USER_ID";
        // TODO Move out from SharedPref
        public final static String CURRENT_TOKEN = "CURRENT_TOKEN";
    }

    public static class WebServer {
        public final static String DOMAIN_NAME = "https://coachingproject.herokuapp.com/";
        public final static String API = "api/";
        public final static String AUTH = "auth/";

        public final static String LOGIN = "login/";
        public final static String ME = "me/";
        public final static String USER_PROFILE = "users/";
        public final static String SPORTS = "sports/";
        public final static String GROUPS = "groups/";
        public final static String LEVELS = "levels/";
        public final static String COACHING_RELATION = "relations/";
        public final static String MESSAGES = "messages/";
        public final static String SEPARATOR = "/";



        public final static String COACH_PARAMETER = "coach";
        public final static String SPORT_PARAMETER = "sport";
        public final static String LEVEL_PARAMETER = "level";
        public final static String KEYWORDS_PARAMETER = "keywords";
        public final static String CITY_PARAMETER = "city";

        public static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
        public static final String TYPE_AUTOCOMPLETE = "/autocomplete";
        public static final String OUT_JSON = "/json";

        public static final String GOOGLE_API_KEY = "AIzaSyA_p6pnmI9pQ13LIRiTaqtIiLxyJuBdFNg";
    }

    public static class BroadcastEvent {
        public final static String EVENT_END_SERVICE_ACTION = "fr.sims.coachingproject.event.END_SERVICE_ACTION";
        public final static String EXTRA_ACTION_NAME = "fr.sims.coachingproject.extra.ACTION_NAME";

        public final static String EVENT_GROUPS_UPDATED = "fr.sims.coachingproject.event.GROUPS_UPDATED";

        public final static String EVENT_COACHING_RELATIONS_UPDATED = "fr.sims.coachingproject.event.COACHING_RELATIONS_UPDATED";
        public final static String EVENT_USER_PROFILE_UPDATED = "fr.sims.coachingproject.event.USER_PROFILE_UPDATED";
        public final static String EVENT_COACHING_RELATION_UPDATED = "fr.sims.coachingproject.event.COACHING_RELATION_UPDATED";
        public final static String EVENT_MESSAGES_UPDATED = "fr.sims.coachingproject.event.MESSAGES_UPDATED";
        public final static String EVENT_COACHING_RELATIONS_ITEM_UPDATED = "fr.sims.coachingproject.event.COACHING_RELATIONS_ITEM_UPDATED";
        public final static String EXTRA_ITEM_ID = "fr.sims.coachingproject.event.EXTRA_ITEM_ID";
    }
}
