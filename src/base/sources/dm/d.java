package dm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36993c = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36995b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(long j10, long j11) {
        this.f36994a = j10;
        this.f36995b = j11;
    }

    private final Object readResolve() {
        return dm.a.f36989c.a(this.f36994a, this.f36995b);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        s.h(input, "input");
        this.f36994a = input.readLong();
        this.f36995b = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        s.h(output, "output");
        output.writeLong(this.f36994a);
        output.writeLong(this.f36995b);
    }
}
