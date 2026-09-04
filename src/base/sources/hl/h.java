package hl;

import gl.r;
import gl.s0;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40460c = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f40461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40462b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(Collection collection, int i10) {
        s.h(collection, "collection");
        this.f40461a = collection;
        this.f40462b = i10;
    }

    private final Object readResolve() {
        return this.f40461a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        List listA;
        s.h(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            List listD = r.d(i11);
            while (i12 < i11) {
                listD.add(input.readObject());
                i12++;
            }
            listA = r.a(listD);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            Set setB = s0.b(i11);
            while (i12 < i11) {
                setB.add(input.readObject());
                i12++;
            }
            listA = s0.a(setB);
        }
        this.f40461a = listA;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        s.h(output, "output");
        output.writeByte(this.f40462b);
        output.writeInt(this.f40461a.size());
        Iterator it = this.f40461a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
