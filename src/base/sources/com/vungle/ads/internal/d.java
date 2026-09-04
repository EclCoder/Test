package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.util.a0;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final String TAG = "ClickCoordinateTracker";
    private final com.vungle.ads.internal.model.b advertisement;
    private final Context context;
    private final a currentClick;
    public static final b Companion = new b(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        private c downCoordinate;
        private c upCoordinate;

        public a(c downCoordinate, c upCoordinate) {
            s.h(downCoordinate, "downCoordinate");
            s.h(upCoordinate, "upCoordinate");
            this.downCoordinate = downCoordinate;
            this.upCoordinate = upCoordinate;
        }

        public static /* synthetic */ a copy$default(a aVar, c cVar, c cVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.downCoordinate;
            }
            if ((i10 & 2) != 0) {
                cVar2 = aVar.upCoordinate;
            }
            return aVar.copy(cVar, cVar2);
        }

        public final c component1() {
            return this.downCoordinate;
        }

        public final c component2() {
            return this.upCoordinate;
        }

        public final a copy(c downCoordinate, c upCoordinate) {
            s.h(downCoordinate, "downCoordinate");
            s.h(upCoordinate, "upCoordinate");
            return new a(downCoordinate, upCoordinate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.c(this.downCoordinate, aVar.downCoordinate) && s.c(this.upCoordinate, aVar.upCoordinate);
        }

        public final c getDownCoordinate() {
            return this.downCoordinate;
        }

        public final c getUpCoordinate() {
            return this.upCoordinate;
        }

        public int hashCode() {
            return (this.downCoordinate.hashCode() * 31) + this.upCoordinate.hashCode();
        }

        public final boolean ready() {
            return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
        }

        public final void setDownCoordinate(c cVar) {
            s.h(cVar, "<set-?>");
            this.downCoordinate = cVar;
        }

        public final void setUpCoordinate(c cVar) {
            s.h(cVar, "<set-?>");
            this.upCoordinate = cVar;
        }

        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f35795x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f35796y;

        public c(int i10, int i11) {
            this.f35795x = i10;
            this.f35796y = i11;
        }

        public static /* synthetic */ c copy$default(c cVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = cVar.f35795x;
            }
            if ((i12 & 2) != 0) {
                i11 = cVar.f35796y;
            }
            return cVar.copy(i10, i11);
        }

        public final int component1() {
            return this.f35795x;
        }

        public final int component2() {
            return this.f35796y;
        }

        public final c copy(int i10, int i11) {
            return new c(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f35795x == cVar.f35795x && this.f35796y == cVar.f35796y;
        }

        public final int getX() {
            return this.f35795x;
        }

        public final int getY() {
            return this.f35796y;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f35795x) * 31) + Integer.hashCode(this.f35796y);
        }

        public String toString() {
            return "Coordinate(x=" + this.f35795x + ", y=" + this.f35796y + ')';
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0499d {
        private final Context context;

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        private final DisplayMetrics f35797dm;

        public C0499d(Context context) {
            s.h(context, "context");
            this.context = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f35797dm = displayMetrics;
            Object systemService = context.getSystemService("window");
            s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static /* synthetic */ C0499d copy$default(C0499d c0499d, Context context, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = c0499d.context;
            }
            return c0499d.copy(context);
        }

        public final Context component1() {
            return this.context;
        }

        public final C0499d copy(Context context) {
            s.h(context, "context");
            return new C0499d(context);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0499d) && s.c(this.context, ((C0499d) obj).context);
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getDeviceHeight() {
            return this.f35797dm.heightPixels;
        }

        public final int getDeviceWidth() {
            return this.f35797dm.widthPixels;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    public d(Context context, com.vungle.ads.internal.model.b advertisement) {
        s.h(context, "context");
        s.h(advertisement, "advertisement");
        this.context = context;
        this.advertisement = advertisement;
        this.currentClick = new a(new c(Integer.MIN_VALUE, Integer.MIN_VALUE), new c(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    private final int getDeviceHeight() {
        return new C0499d(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new C0499d(this.context).getDeviceWidth();
    }

    private final int getRequestedHeight() {
        int iAdHeight = this.advertisement.adHeight();
        return iAdHeight == 0 ? getDeviceHeight() : a0.INSTANCE.dpToPixels(this.context, iAdHeight);
    }

    private final int getRequestedWidth() {
        int iAdWidth = this.advertisement.adWidth();
        return iAdWidth == 0 ? getDeviceWidth() : a0.INSTANCE.dpToPixels(this.context, iAdWidth);
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = com.vungle.ads.internal.model.b.getTpatUrls$default(this.advertisement, f.TPAT_CLICK_COORDINATES, null, null, 6, null);
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk$SDKError.b.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        fl.k kVarA = fl.l.a(fl.o.SYNCHRONIZED, new e(this.context));
        for (String str : tpatUrls$default) {
            String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            s.g(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            String strI = new bm.o(MACRO_REQ_WIDTH2).i(str, String.valueOf(requestedWidth));
            String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            s.g(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            String strI2 = new bm.o(MACRO_REQ_HEIGHT2).i(strI, String.valueOf(requestedHeight));
            String MACRO_WIDTH2 = MACRO_WIDTH;
            s.g(MACRO_WIDTH2, "MACRO_WIDTH");
            String strI3 = new bm.o(MACRO_WIDTH2).i(strI2, String.valueOf(requestedWidth2));
            String MACRO_HEIGHT2 = MACRO_HEIGHT;
            s.g(MACRO_HEIGHT2, "MACRO_HEIGHT");
            String strI4 = new bm.o(MACRO_HEIGHT2).i(strI3, String.valueOf(requestedHeight2));
            String MACRO_DOWN_X2 = MACRO_DOWN_X;
            s.g(MACRO_DOWN_X2, "MACRO_DOWN_X");
            String strI5 = new bm.o(MACRO_DOWN_X2).i(strI4, String.valueOf(this.currentClick.getDownCoordinate().getX()));
            String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            s.g(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            String strI6 = new bm.o(MACRO_DOWN_Y2).i(strI5, String.valueOf(this.currentClick.getDownCoordinate().getY()));
            String MACRO_UP_X2 = MACRO_UP_X;
            s.g(MACRO_UP_X2, "MACRO_UP_X");
            String strI7 = new bm.o(MACRO_UP_X2).i(strI6, String.valueOf(this.currentClick.getUpCoordinate().getX()));
            String MACRO_UP_Y2 = MACRO_UP_Y;
            s.g(MACRO_UP_Y2, "MACRO_UP_Y");
            com.vungle.ads.internal.network.i.sendTpat$default(m81sendClickCoordinates$lambda0(kVarA), new com.vungle.ads.internal.network.g.a(new bm.o(MACRO_UP_Y2).i(strI7, String.valueOf(this.currentClick.getUpCoordinate().getY()))).tpatKey(f.COORDINATE).build(), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m81sendClickCoordinates$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    public final a getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent event) {
        s.h(event, "event");
        if (this.advertisement.isClickCoordinatesTrackingEnabled()) {
            int action = event.getAction();
            if (action == 0) {
                this.currentClick.setDownCoordinate(new c((int) event.getX(), (int) event.getY()));
            } else {
                if (action != 1) {
                    return;
                }
                this.currentClick.setUpCoordinate(new c((int) event.getX(), (int) event.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                }
            }
        }
    }

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }
}
