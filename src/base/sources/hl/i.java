package hl;

import gl.l0;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i implements Externalizable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40463b = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f40464a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(Map map) {
        s.h(map, "map");
        this.f40464a = map;
    }

    private final Object readResolve() {
        return this.f40464a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        s.h(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        Map mapD = l0.d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapD.put(input.readObject(), input.readObject());
        }
        this.f40464a = l0.b(mapD);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        s.h(output, "output");
        output.writeByte(0);
        output.writeInt(this.f40464a.size());
        for (Map.Entry entry : this.f40464a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
