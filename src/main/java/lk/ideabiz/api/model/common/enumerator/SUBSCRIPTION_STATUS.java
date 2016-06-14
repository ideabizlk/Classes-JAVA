package lk.ideabiz.api.model.common.enumerator;

/**
 * Created by Malinda on 7/27/2015.
 */


/**
 * Subscriber subscription status
 */
public enum SUBSCRIPTION_STATUS {
    SUBSCRIBE,
    UNSUBSCRIBE,
    SUBSCRIBED, //Active and subscribed to app
    UNSUBSCRIBED, //already unsubscribed from app
    NOT_HOME_NETWORK,
    WRONG_FORMAT,
    ALREADY_SUBSCRIBED,
    NOT_SUBSCRIBED

}