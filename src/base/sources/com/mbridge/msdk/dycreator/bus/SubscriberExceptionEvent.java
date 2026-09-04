package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class SubscriberExceptionEvent {
    public final Object causingEvent;
    public final Object causingSubscriber;
    public final EventBus eventBus;
    public final Throwable throwable;

    public SubscriberExceptionEvent(EventBus eventBus, Throwable th2, Object obj, Object obj2) {
        this.eventBus = eventBus;
        this.throwable = th2;
        this.causingEvent = obj;
        this.causingSubscriber = obj2;
    }
}
