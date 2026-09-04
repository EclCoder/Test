package sf;

import android.content.Context;
import android.content.SharedPreferences;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl.k f52390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f52391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f52392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f52393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f52394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f52395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f52396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f52397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f52398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f52399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b f52400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f52401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f52402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f52403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f52404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l f52405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l f52406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f52407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l f52408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l f52409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final l f52410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d f52411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final l f52412w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final /* synthetic */ zl.k[] f52389y = {l0.e(new w(i.class, "isMainControllerLeft", "isMainControllerLeft()Z", 0)), l0.e(new w(i.class, "mainControllerHeight", "getMainControllerHeight()I", 0)), l0.e(new w(i.class, "isLiveControllerLeft", "isLiveControllerLeft()Z", 0)), l0.e(new w(i.class, "liveControllerHeight", "getLiveControllerHeight()I", 0)), l0.e(new w(i.class, "isLiveCommentEnabled", "isLiveCommentEnabled()Z", 0)), l0.e(new w(i.class, "hideBubbleDuringRecord", "getHideBubbleDuringRecord()Z", 0)), l0.e(new w(i.class, "showScreenshotBubble", "getShowScreenshotBubble()Z", 0)), l0.e(new w(i.class, "showDrawerBubble", "getShowDrawerBubble()Z", 0)), l0.e(new w(i.class, "showCameraBubble", "getShowCameraBubble()Z", 0)), l0.e(new w(i.class, "paintColor", "getPaintColor()I", 0)), l0.e(new w(i.class, "paintWidth", "getPaintWidth()I", 0)), l0.e(new w(i.class, "warningFor51", "getWarningFor51()Z", 0)), l0.e(new w(i.class, "disablePopupAfterScreenshot", "getDisablePopupAfterScreenshot()Z", 0)), l0.e(new w(i.class, "selectedFbDestination", "getSelectedFbDestination()Ljava/lang/String;", 0)), l0.e(new w(i.class, "liveFbEncodeParam", "getLiveFbEncodeParam()Ljava/lang/String;", 0)), l0.e(new w(i.class, "liveFbTittle", "getLiveFbTittle()Ljava/lang/String;", 0)), l0.e(new w(i.class, "liveYtEncodeParam", "getLiveYtEncodeParam()Ljava/lang/String;", 0)), l0.e(new w(i.class, "liveYtDescription", "getLiveYtDescription()Ljava/lang/String;", 0)), l0.e(new w(i.class, "liveYtTitle", "getLiveYtTitle()Ljava/lang/String;", 0)), l0.e(new w(i.class, "liveYtPrivacyStatus", "getLiveYtPrivacyStatus()I", 0)), l0.e(new w(i.class, "authState", "getAuthState()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f52388x = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(final Context context) {
        s.h(context, "context");
        fl.k kVarB = fl.l.b(new tl.a() { // from class: sf.g
            @Override // tl.a
            public final Object invoke() {
                return i.M(context, this);
            }
        });
        this.f52390a = kVarB;
        this.f52391b = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sf.h
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                i.L(sharedPreferences, str);
            }
        };
        String string = context.getString(R.string.pref_last_bubble_side);
        s.g(string, "getString(...)");
        this.f52392c = new b(kVarB, string, false);
        String string2 = context.getString(R.string.pref_last_bubble_height);
        s.g(string2, "getString(...)");
        this.f52393d = new d(kVarB, string2, 50);
        String string3 = context.getString(R.string.pref_last_live_bubble_side);
        s.g(string3, "getString(...)");
        this.f52394e = new b(kVarB, string3, true);
        String string4 = context.getString(R.string.pref_last_live_bubble_height);
        s.g(string4, "getString(...)");
        this.f52395f = new d(kVarB, string4, 50);
        String string5 = context.getString(R.string.pref_live_comment_enabled);
        s.g(string5, "getString(...)");
        this.f52396g = new b(kVarB, string5, true);
        String string6 = context.getString(R.string.pref_hide_record_window);
        s.g(string6, "getString(...)");
        this.f52397h = new b(kVarB, string6, false);
        String string7 = context.getString(R.string.pref_show_screenshot);
        s.g(string7, "getString(...)");
        this.f52398i = new b(kVarB, string7, false);
        String string8 = context.getString(R.string.pref_show_screendraw);
        s.g(string8, "getString(...)");
        this.f52399j = new b(kVarB, string8, false);
        String string9 = context.getString(R.string.pref_show_camera);
        s.g(string9, "getString(...)");
        this.f52400k = new b(kVarB, string9, false);
        String string10 = context.getString(R.string.pref_drawing_color);
        s.g(string10, "getString(...)");
        this.f52401l = new d(kVarB, string10, context.getResources().getColor(R.color.bright_red));
        String string11 = context.getString(R.string.pref_drawing_size);
        s.g(string11, "getString(...)");
        this.f52402m = new d(kVarB, string11, 6);
        String string12 = context.getString(R.string.pref_show_warning_for_5_1);
        s.g(string12, "getString(...)");
        this.f52403n = new b(kVarB, string12, false);
        String string13 = context.getString(R.string.pref_hide_screenshot_saved_window);
        s.g(string13, "getString(...)");
        this.f52404o = new b(kVarB, string13, false);
        String string14 = context.getString(R.string.pref_live_facebook_destination);
        s.g(string14, "getString(...)");
        this.f52405p = new l(kVarB, string14, "");
        String string15 = context.getString(R.string.pref_live_fb_encode_param);
        s.g(string15, "getString(...)");
        this.f52406q = new l(kVarB, string15, "");
        String string16 = context.getString(R.string.pref_live_facebook_title);
        s.g(string16, "getString(...)");
        this.f52407r = new l(kVarB, string16, "");
        String string17 = context.getString(R.string.pref_live_yt_encode_param);
        s.g(string17, "getString(...)");
        this.f52408s = new l(kVarB, string17, "");
        String string18 = context.getString(R.string.pref_live_youtube_description);
        s.g(string18, "getString(...)");
        this.f52409t = new l(kVarB, string18, "");
        String string19 = context.getString(R.string.pref_live_youtube_title);
        s.g(string19, "getString(...)");
        this.f52410u = new l(kVarB, string19, "");
        String string20 = context.getString(R.string.pref_live_youtube_privacy_status);
        s.g(string20, "getString(...)");
        this.f52411v = new d(kVarB, string20, 0);
        String string21 = context.getString(R.string.pref_auth_state);
        s.g(string21, "getString(...)");
        this.f52412w = new l(kVarB, string21, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences M(Context context, i iVar) {
        SharedPreferences sharedPreferencesB = androidx.preference.j.b(context);
        sharedPreferencesB.registerOnSharedPreferenceChangeListener(iVar.f52391b);
        return sharedPreferencesB;
    }

    @Override // sf.e
    public String A() {
        return this.f52405p.getValue(this, f52389y[13]);
    }

    @Override // sf.e
    public boolean B() {
        return this.f52399j.getValue(this, f52389y[7]).booleanValue();
    }

    @Override // sf.e
    public void C(String str) {
        s.h(str, "<set-?>");
        this.f52408s.b(this, f52389y[16], str);
    }

    @Override // sf.e
    public void D(boolean z10) {
        this.f52394e.b(this, f52389y[2], z10);
    }

    @Override // sf.e
    public void E(boolean z10) {
        this.f52392c.b(this, f52389y[0], z10);
    }

    @Override // sf.e
    public String F() {
        return this.f52412w.getValue(this, f52389y[20]);
    }

    @Override // sf.e
    public void G(boolean z10) {
        this.f52399j.b(this, f52389y[7], z10);
    }

    @Override // sf.e
    public String H() {
        return this.f52407r.getValue(this, f52389y[15]);
    }

    @Override // sf.e
    public int I() {
        return this.f52393d.getValue(this, f52389y[1]).intValue();
    }

    @Override // sf.e
    public String a() {
        return this.f52408s.getValue(this, f52389y[16]);
    }

    @Override // sf.e
    public boolean b() {
        return this.f52394e.getValue(this, f52389y[2]).booleanValue();
    }

    @Override // sf.e
    public boolean c() {
        return this.f52392c.getValue(this, f52389y[0]).booleanValue();
    }

    @Override // sf.e
    public String d() {
        return this.f52406q.getValue(this, f52389y[14]);
    }

    @Override // sf.e
    public boolean e() {
        return this.f52397h.getValue(this, f52389y[5]).booleanValue();
    }

    @Override // sf.e
    public void f(boolean z10) {
        this.f52396g.b(this, f52389y[4], z10);
    }

    @Override // sf.e
    public String g() {
        return this.f52409t.getValue(this, f52389y[17]);
    }

    @Override // sf.e
    public int h() {
        return this.f52411v.getValue(this, f52389y[19]).intValue();
    }

    @Override // sf.e
    public boolean i() {
        return this.f52404o.getValue(this, f52389y[12]).booleanValue();
    }

    @Override // sf.e
    public boolean j() {
        return this.f52396g.getValue(this, f52389y[4]).booleanValue();
    }

    @Override // sf.e
    public void k(boolean z10) {
        this.f52398i.b(this, f52389y[6], z10);
    }

    @Override // sf.e
    public boolean l() {
        return this.f52400k.getValue(this, f52389y[8]).booleanValue();
    }

    @Override // sf.e
    public int m() {
        return this.f52401l.getValue(this, f52389y[9]).intValue();
    }

    @Override // sf.e
    public void n(int i10) {
        this.f52395f.b(this, f52389y[3], i10);
    }

    @Override // sf.e
    public void o(String str) {
        s.h(str, "<set-?>");
        this.f52410u.b(this, f52389y[18], str);
    }

    @Override // sf.e
    public void p(String str) {
        s.h(str, "<set-?>");
        this.f52409t.b(this, f52389y[17], str);
    }

    @Override // sf.e
    public void q(int i10) {
        this.f52393d.b(this, f52389y[1], i10);
    }

    @Override // sf.e
    public int r() {
        return this.f52402m.getValue(this, f52389y[10]).intValue();
    }

    @Override // sf.e
    public void s(int i10) {
        this.f52411v.b(this, f52389y[19], i10);
    }

    @Override // sf.e
    public void t(String str) {
        s.h(str, "<set-?>");
        this.f52406q.b(this, f52389y[14], str);
    }

    @Override // sf.e
    public void u(String str) {
        s.h(str, "<set-?>");
        this.f52407r.b(this, f52389y[15], str);
    }

    @Override // sf.e
    public int v() {
        return this.f52395f.getValue(this, f52389y[3]).intValue();
    }

    @Override // sf.e
    public void w(String str) {
        s.h(str, "<set-?>");
        this.f52405p.b(this, f52389y[13], str);
    }

    @Override // sf.e
    public String x() {
        return this.f52410u.getValue(this, f52389y[18]);
    }

    @Override // sf.e
    public void y(String str) {
        s.h(str, "<set-?>");
        this.f52412w.b(this, f52389y[20], str);
    }

    @Override // sf.e
    public boolean z() {
        return this.f52398i.getValue(this, f52389y[6]).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(SharedPreferences sharedPreferences, String str) {
    }
}
