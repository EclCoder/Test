package m7;

import android.os.Bundle;
import com.facebook.h0;
import com.facebook.internal.a0;
import com.facebook.internal.w;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import fl.k;
import fl.l;
import gl.s0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45306b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashSet f45308d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f45305a = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f45307c = l.b(a.f45309a);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45309a = new a();

        a() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final HashSet invoke() {
            return s0.e("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "add_to_messaging_customer_base_for_whatsapp", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", lkCBSIFlvmyGX.iZsshn, "pm", "_audiencePropertyIds", "cs_maca");
        }
    }

    private e() {
    }

    private final HashSet a(JSONArray jSONArray) {
        if (!x7.a.c(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray.getString(i10);
                        s.g(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }
        return null;
    }

    public static final void b() {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            f45306b = true;
            f45305a.e();
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public static final boolean d() {
        if (x7.a.c(e.class)) {
            return false;
        }
        try {
            return f45306b;
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
            return false;
        }
    }

    private final void e() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            w wVarV = a0.v(h0.n(), false);
            if (wVarV == null) {
                return;
            }
            HashSet hashSetA = a(wVarV.o());
            if (hashSetA == null) {
                hashSetA = c();
            }
            f45308d = hashSetA;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void f(Bundle bundle) {
        if (x7.a.c(e.class)) {
            return;
        }
        try {
            if (f45306b && bundle != null && !bundle.isEmpty() && f45308d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                s.g(setKeySet, "parameters.keySet()");
                for (String param : setKeySet) {
                    HashSet hashSet = f45308d;
                    s.e(hashSet);
                    if (!hashSet.contains(param)) {
                        s.g(param, "param");
                        arrayList.add(param);
                    }
                }
                int size = arrayList.size();
                boolean z10 = false;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        z10 = true;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cd", z10);
                bundle.putString("pm_metadata", jSONObject.toString());
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            x7.a.b(th2, e.class);
        }
    }

    public final HashSet c() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            return (HashSet) f45307c.getValue();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final boolean g(Bundle bundle) {
        if (x7.a.c(this) || bundle == null) {
            return false;
        }
        try {
            return bundle.containsKey("pm") && s.c(bundle.get("pm"), "1");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return false;
        }
    }
}
