package love.wintrue.com.lovestaff.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import love.wintrue.com.lovestaff.R;

public class ActivityUtil {

	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 */
	public static void next(Activity curActivity, Class<?> nextActivity) {
		next(curActivity, nextActivity, null, -1, -1, R.anim.in_from_right,R.anim.out_to_left, false);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, int inAnimId, int outAnimId) {
		next(curActivity, nextActivity, null, -1, -1, inAnimId, outAnimId, false);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 */
	public static void next(Activity curActivity, Class<?> nextActivity,Bundle extras, int reqCode) {
		next(curActivity, nextActivity, extras, reqCode, -1, R.anim.in_from_right, R.anim.out_to_left, false);
	}

	/**
	 * 跳转到下一个页面
	 *
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 */
	public static void nextBottom(Activity curActivity, Class<?> nextActivity,Bundle extras, int reqCode) {
		next(curActivity, nextActivity, extras, reqCode, -1, R.anim.slide_bottom_in, R.anim.slide_bottom_out, false);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param flag
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, int flag, int inAnimId, int outAnimId) {
		next(curActivity, nextActivity, null, -1, flag, inAnimId, outAnimId, false);
	}

	public static void next(Activity curActivity, Class<?> nextActivity, int flag) {
		next(curActivity, nextActivity, null, -1, flag, R.anim.in_from_right, R.anim.out_to_left, false);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, Bundle extras, int reqCode, int inAnimId, int outAnimId) {
		next(curActivity, nextActivity, extras, reqCode, -1, inAnimId, outAnimId, false);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, Bundle extras, int reqCode, int flag, int inAnimId, int outAnimId) {
		next(curActivity, nextActivity, extras, reqCode, -1, inAnimId, outAnimId, false);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param isFinish 当前activity是否finish掉
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, boolean isFinish) {
		next(curActivity, nextActivity, null, -1, -1, R.anim.in_from_right, R.anim.out_to_left, isFinish);
	}
	/**
	 * 携带数据跳转到下一个页面
	 * @param curActivity
	 * @param nextActivity
	 * @param extra
	 * @param isFinish
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, Bundle extra,boolean isFinish) {
		next(curActivity, nextActivity, extra, -1, -1, R.anim.in_from_right, R.anim.out_to_left, isFinish);
	}
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 * @param isFinish 当前activity是否finish掉
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, int inAnimId, int outAnimId , boolean isFinish) {
		next(curActivity, nextActivity, null, -1, -1, inAnimId, outAnimId, isFinish);
	}
	
	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 * @param isFinish 当前activity是否finish掉
	 */
	public static void next(Activity curActivity, Class<?> nextActivity,Bundle extras, int reqCode , boolean isFinish) {
		next(curActivity, nextActivity, extras, reqCode, -1, R.anim.in_from_right, R.anim.out_to_left, isFinish);
	}

	public static void next(Activity curActivity, Class<?> nextActivity,Bundle extras, int reqCode ,int flag, boolean isFinish) {
		next(curActivity, nextActivity, extras, reqCode, flag, R.anim.in_from_right, R.anim.out_to_left, isFinish);
	}

	public static void next(Activity curActivity, Class<?> nextActivity,Bundle extras,int reqCode, int flag) {
		next(curActivity, nextActivity, extras, reqCode, flag, R.anim.in_from_right, R.anim.out_to_left, true);
	}


	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param flag
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 * @param isFinish 当前activity是否finish掉
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, int flag, int inAnimId, int outAnimId, boolean isFinish) {
		next(curActivity, nextActivity, null, -1, flag, inAnimId, outAnimId, isFinish);
	}



	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 * @param isFinish 当前activity是否finish掉
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, Bundle extras, int reqCode, int inAnimId, int outAnimId, boolean isFinish) {
		next(curActivity, nextActivity, extras, reqCode, -1, inAnimId, outAnimId, isFinish);
	}

	/**
	 * 跳转到下一个页面
	 * 
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 * @param reqCode
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 * @param isFinish 当前activity是否finish掉
	 */
	public static void next(Activity curActivity, Class<?> nextActivity, Bundle extras, int reqCode, int flag, int inAnimId, int outAnimId, boolean isFinish) {
		Intent intent = new Intent(curActivity, nextActivity);
		if (null != extras) {
			intent.putExtras(extras);
		}
		if (flag != -1) {
			intent.setFlags(flag);
		}
		//设置返回值模式
		if (reqCode < 0) {
			curActivity.startActivity(intent);
		} else {
			curActivity.startActivityForResult(intent, reqCode);
		}
		//加入转场动画
		if (inAnimId != -1 && outAnimId != -1) {
			curActivity.overridePendingTransition(inAnimId, outAnimId);
		}
		//是否销毁当前activity
		if (isFinish) {
			curActivity.finish();
		}
	}

	/**
	 * 跳转到下一个页面
	 *
	 * @param curActivity
	 * @param nextActivity
	 * @param extras
	 */
	public static void next(Context curActivity, Class<?> nextActivity, Bundle extras, int flag) {
		Intent intent = new Intent(curActivity, nextActivity);
		if (null != extras) {
			intent.putExtras(extras);
		}
		if (flag != -1) {
			intent.setFlags(flag);
		}
		curActivity.startActivity(intent);
	}

	public static void nextWithNoAnim(Activity curActivity, Class<?> nextActivity, Bundle extras,int reqCode){
		Intent intent = new Intent(curActivity, nextActivity);
		if (null != extras) {
			intent.putExtras(extras);
		}
		if (reqCode < 0) {
			curActivity.startActivity(intent);
		} else {
			curActivity.startActivityForResult(intent, reqCode);
		}
	}

	public static void nextWithNoAnim(Context curActivity, Class<?> nextActivity, Bundle extras){
		Intent intent = new Intent(curActivity, nextActivity);
		if (null != extras) {
			intent.putExtras(extras);
		}
		curActivity.startActivity(intent);
	}

	public static void next(Context curActivity, Class<?> nextActivity, int flag) {
		next(curActivity, nextActivity, null, flag);
	}

	public static void next(Context curActivity, Class<?> nextActivity) {
		next(curActivity, nextActivity, null, -1);
	}


	/**
	 * 直接返回到指定的某个页面
	 * 
	 * @param curActivity
	 * @param backActivity
	 */
	public static void nextActivityWithClearTop(Activity curActivity, Class<?> backActivity) {
		nextActivityWithClearTop(curActivity, backActivity, null, R.anim.in_from_left, R.anim.out_to_right);
	}
	
	/**
	 * 直接返回到指定的某个页面
	 * 
	 * @param curActivity
	 * @param backActivity
	 * @param inAnimId
	 * @param outAnimId
	 */
	public static void nextActivityWithClearTop(Activity curActivity, Class<?> backActivity, int inAnimId, int outAnimId) {
		nextActivityWithClearTop(curActivity, backActivity, null, inAnimId, outAnimId);
	}

	/**
	 * 直接返回到指定的某个页面
	 * 
	 * @param curActivity
	 * @param backActivity
	 * @param extras
	 */
	public static void nextActivityWithClearTop(Activity curActivity, Class<?> backActivity, Bundle extras) {
		nextActivityWithClearTop(curActivity, backActivity, extras, R.anim.in_from_left, R.anim.out_to_right);
	}

	/**
	 * 直接返回到指定的某个页面
	 * 
	 * @param curActivity
	 * @param backActivity
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 */
	public static void nextActivityWithClearTop(Activity curActivity, Class<?> backActivity, Bundle extras, int inAnimId, int outAnimId) {
		Intent intent = new Intent(curActivity, backActivity);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		if (null != extras) {
			intent.putExtras(extras);
		}
		curActivity.startActivity(intent);
		//加入退场动画
		if (inAnimId != -1 && outAnimId != -1) {
			curActivity.overridePendingTransition(inAnimId, outAnimId);
		}
        curActivity.finish();
	}
	
	/**
	 * 返回到上一个页面
	 * 
	 * @param curActivity
	 */
	public static void back(Activity curActivity) {
		back(curActivity, R.anim.in_from_left, R.anim.out_to_right);
	}

	/**
	 * 返回到上一个页面
	 * 
	 * @param curActivity
	 * @param inAnimId 入场动画
	 * @param outAnimId 退场动画
	 */
	public static void back(Activity curActivity, int inAnimId, int outAnimId) {
		curActivity.finish();
		//加入退场动画
		if (inAnimId != -1 && outAnimId != -1) {
			curActivity.overridePendingTransition(inAnimId, outAnimId);
		}
	}

	/**
	 * 返回到上一个页面并返回值
	 * 
	 * @param curActivity
	 * @param retCode
	 * @param retData
	 */
	public static void backWithResult(Activity curActivity, int retCode, Bundle retData) {
		backWithResult(curActivity, retCode, retData, R.anim.in_from_left, R.anim.out_to_right);
	}

	/**
	 * 返回到上一个页面并返回值
	 * 
	 * @param curActivity
	 * @param retCode
	 * @param retData
	 * @param inAnimId
	 * @param outAnimId
	 */
	public static void backWithResult(Activity curActivity, int retCode, Bundle retData, int inAnimId, int outAnimId) {
		Intent intent = new Intent();
		if (null != retData) {
			intent.putExtras(retData);
		}
		curActivity.setResult(retCode, intent);
		curActivity.finish();
		//加入退场动画
		if (inAnimId != -1 && outAnimId != -1) {
			curActivity.overridePendingTransition(inAnimId, outAnimId);
		}
	}

}
