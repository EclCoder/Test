package androidx.privacysandbox.ads.adservices.topics;

import gl.r;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f6527b;

    public c(List topics, List encryptedTopics) {
        s.h(topics, "topics");
        s.h(encryptedTopics, "encryptedTopics");
        this.f6526a = topics;
        this.f6527b = encryptedTopics;
    }

    public final List a() {
        return this.f6526a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6526a.size() == cVar.f6526a.size() && this.f6527b.size() == cVar.f6527b.size() && s.c(new HashSet(this.f6526a), new HashSet(cVar.f6526a)) && s.c(new HashSet(this.f6527b), new HashSet(cVar.f6527b));
    }

    public int hashCode() {
        return Objects.hash(this.f6526a, this.f6527b);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f6526a + ", EncryptedTopics=" + this.f6527b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(List topics) {
        this(topics, r.l());
        s.h(topics, "topics");
    }
}
