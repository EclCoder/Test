package c1;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9257a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) throws CorruptionException {
            s.h(input, "input");
            try {
                f fVarR = f.R(input);
                s.g(fVarR, "{\n                Prefer…From(input)\n            }");
                return fVarR;
            } catch (InvalidProtocolBufferException e10) {
                throw new CorruptionException("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
