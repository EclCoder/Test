package d7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes"),
    ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP("add_to_messaging_customer_base_for_whatsapp");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36260b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36280a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String rawValue) {
            s.h(rawValue, "rawValue");
            for (b bVar : b.values()) {
                if (s.c(bVar.g(), rawValue)) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    b(String str) {
        this.f36280a = str;
    }

    public final String g() {
        return this.f36280a;
    }
}
