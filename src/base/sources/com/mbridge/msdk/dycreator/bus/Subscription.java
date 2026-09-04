package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f29959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SubscriberMethod f29960b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f29959a = obj;
        this.f29960b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f29959a == subscription.f29959a && this.f29960b.equals(subscription.f29960b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f29959a.hashCode() + this.f29960b.f29956d.hashCode();
    }
}
