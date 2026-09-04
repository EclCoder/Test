package ne;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f47098a = new a1();

    private a1() {
    }

    @Override // ne.z0
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.s.g(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
