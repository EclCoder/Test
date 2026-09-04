package sf;

import android.content.SharedPreferences;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl.k f52380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52382c;

    public d(fl.k preferences, String name, int i10) {
        s.h(preferences, "preferences");
        s.h(name, "name");
        this.f52380a = preferences;
        this.f52381b = name;
        this.f52382c = i10;
    }

    @Override // kotlin.properties.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getValue(Object thisRef, zl.k property) {
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        return Integer.valueOf(((SharedPreferences) this.f52380a.getValue()).getInt(this.f52381b, this.f52382c));
    }

    public void b(Object thisRef, zl.k property, int i10) {
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f52380a.getValue()).edit();
        editorEdit.putInt(this.f52381b, i10);
        editorEdit.apply();
    }
}
