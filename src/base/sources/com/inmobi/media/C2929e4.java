package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2929e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3167n9 f26445a;

    public C2929e4(C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f26445a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        C2904d4 c2904d4;
        Config config;
        if (dVar instanceof C2904d4) {
            c2904d4 = (C2904d4) dVar;
            int i10 = c2904d4.f26391c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2904d4.f26391c = i10 - Integer.MIN_VALUE;
            } else {
                c2904d4 = new C2904d4(this, dVar);
            }
        } else {
            c2904d4 = new C2904d4(this, dVar);
        }
        Object objA = c2904d4.f26389a;
        Object objF = ll.b.f();
        int i11 = c2904d4.f26391c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f26445a;
            c2904d4.f26391c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM config_db", null), c2904d4);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        ((List) objA).toString();
        ArrayList arrayList = new ArrayList();
        for (ContentValues contentValues : (Iterable) objA) {
            kotlin.jvm.internal.s.h(contentValues, "<this>");
            String asString = contentValues.getAsString("config_value");
            Long asLong = contentValues.getAsLong("update_ts");
            try {
                JSONObject jsonObject = new JSONObject(asString);
                String configType = contentValues.getAsString("config_type");
                kotlin.jvm.internal.s.g(configType, "getAsString(...)");
                kotlin.jvm.internal.s.e(asLong);
                long jLongValue = asLong.longValue();
                kotlin.jvm.internal.s.h(configType, "configType");
                Class type = AbstractC3421x4.a(configType);
                kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
                kotlin.jvm.internal.s.h(type, "type");
                config = (Config) type.cast(AbstractC3323ta.a(jsonObject, type, null, null));
                if (config != null) {
                    config.setLastUpdateTimeStamp(jLongValue);
                } else {
                    config = null;
                }
            } catch (Exception unused) {
            }
            String.valueOf(config);
            if (config != null) {
                arrayList.add(config);
            }
        }
        return arrayList;
    }
}
