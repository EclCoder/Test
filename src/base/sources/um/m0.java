package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 {
    public static final Object a(kotlinx.serialization.json.b json, pm.c deserializer, b0 reader) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(deserializer, "deserializer");
        kotlin.jvm.internal.s.h(reader, "reader");
        x0 x0VarB = y0.b(json, reader, null, 4, null);
        try {
            Object objD = new a1(json, k1.OBJ, x0VarB, deserializer.getDescriptor(), null).D(deserializer);
            x0VarB.v();
            return objD;
        } finally {
            x0VarB.V();
        }
    }

    public static final void b(kotlinx.serialization.json.b json, c0 writer, pm.l serializer, Object obj) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(writer, "writer");
        kotlin.jvm.internal.s.h(serializer, "serializer");
        new b1(writer, json, k1.OBJ, new kotlinx.serialization.json.t[k1.g().size()]).q(serializer, obj);
    }
}
