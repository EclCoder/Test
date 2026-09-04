package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f1788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1789d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0015a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f1790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f1791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f1792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1793d;

        public a a() {
            return new a(this.f1790a, this.f1791b, this.f1792c, this.f1793d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1786a = num;
        this.f1787b = num2;
        this.f1788c = num3;
        this.f1789d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1786a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1787b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1788c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1789d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
