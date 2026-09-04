package sf;

import android.content.SharedPreferences;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl.k f52419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f52421c;

    public l(fl.k preferences, String name, String defaultValue) {
        s.h(preferences, "preferences");
        s.h(name, "name");
        s.h(defaultValue, "defaultValue");
        this.f52419a = preferences;
        this.f52420b = name;
        this.f52421c = defaultValue;
    }

    @Override // kotlin.properties.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getValue(Object thisRef, zl.k property) {
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        String string = ((SharedPreferences) this.f52419a.getValue()).getString(this.f52420b, this.f52421c);
        return string == null ? this.f52421c : string;
    }

    public void b(Object thisRef, zl.k property, String str) {
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f52419a.getValue()).edit();
        editorEdit.putString(this.f52420b, str);
        editorEdit.apply();
    }
}
