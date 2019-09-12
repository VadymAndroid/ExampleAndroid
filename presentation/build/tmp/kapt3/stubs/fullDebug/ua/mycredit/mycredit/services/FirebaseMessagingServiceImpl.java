package ua.mycredit.mycredit.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u00a8\u0006\u0016"}, d2 = {"Lua/mycredit/mycredit/services/FirebaseMessagingServiceImpl;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "getAndSaveBundle", "Landroid/os/Bundle;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onMessageReceived", "", "onNewToken", "s", "", "pendingIntent", "Landroid/app/PendingIntent;", "intent", "Landroid/content/Intent;", "sendSimpleNotification", "messageBody", "sendWebNotification", "bundle", "showNotificationCompact", "Landroid/support/v4/app/NotificationCompat$Builder;", "presentation_fullDebug"})
public final class FirebaseMessagingServiceImpl extends com.google.firebase.messaging.FirebaseMessagingService {
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.Nullable()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void sendSimpleNotification(java.lang.String messageBody) {
    }
    
    private final void sendWebNotification(android.os.Bundle bundle, java.lang.String messageBody) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.Nullable()
    java.lang.String s) {
    }
    
    private final android.support.v4.app.NotificationCompat.Builder showNotificationCompact(java.lang.String messageBody, android.app.PendingIntent pendingIntent) {
        return null;
    }
    
    private final android.os.Bundle getAndSaveBundle(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        return null;
    }
    
    private final android.app.PendingIntent pendingIntent(android.content.Intent intent) {
        return null;
    }
    
    public FirebaseMessagingServiceImpl() {
        super();
    }
}