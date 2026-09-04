package com.google.api.client.googleapis.notifications;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TypedNotification<T> extends AbstractNotification {
    private T content;

    public TypedNotification(long j10, String str, String str2, String str3, String str4) {
        super(j10, str, str2, str3, str4);
    }

    public final T getContent() {
        return this.content;
    }

    public TypedNotification<T> setContent(T t10) {
        this.content = t10;
        return this;
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public String toString() {
        return super.toStringHelper().add("content", this.content).toString();
    }

    public TypedNotification(UnparsedNotification unparsedNotification) {
        super(unparsedNotification);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChanged(String str) {
        return (TypedNotification) super.setChanged(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChannelExpiration(String str) {
        return (TypedNotification) super.setChannelExpiration(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChannelId(String str) {
        return (TypedNotification) super.setChannelId(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setChannelToken(String str) {
        return (TypedNotification) super.setChannelToken(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setMessageNumber(long j10) {
        return (TypedNotification) super.setMessageNumber(j10);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setResourceId(String str) {
        return (TypedNotification) super.setResourceId(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setResourceState(String str) {
        return (TypedNotification) super.setResourceState(str);
    }

    @Override // com.google.api.client.googleapis.notifications.AbstractNotification
    public TypedNotification<T> setResourceUri(String str) {
        return (TypedNotification) super.setResourceUri(str);
    }
}
