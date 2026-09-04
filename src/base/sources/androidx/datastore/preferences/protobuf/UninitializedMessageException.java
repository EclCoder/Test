package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3498a;

    public UninitializedMessageException(n0 n0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f3498a = null;
    }

    public InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
