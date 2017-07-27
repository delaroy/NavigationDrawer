package com.delaroystudios.navigationdrawer;

/**
 * Created by delaroy on 3/21/17.
 */
public class Methods {

    public void setColorTheme(){

        switch (Constant.color){
            case 0xffF44336:
                Constant.theme = R.style.AppTheme_red;
                break;
            case 0xffE91E63:
                Constant.theme = R.style.AppTheme_pink;
                break;
            case 0xff9C27B0:
                Constant.theme = R.style.AppTheme_darpink;
                break;
            case 0xff673AB7:
                Constant.theme = R.style.AppTheme_violet;
                break;
            case 0xff3F51B5:
                Constant.theme = R.style.AppTheme_blue;
                break;
            case 0xff03A9F4:
                Constant.theme = R.style.AppTheme_skyblue;
                break;
            case 0xff4CAF50:
                Constant.theme = R.style.AppTheme_green;
                break;
            case 0xffFF9800:
                Constant.theme = R.style.AppTheme;
                break;
            case 0xff9E9E9E:
                Constant.theme = R.style.AppTheme_grey;
                break;
            case 0xff795548:
                Constant.theme = R.style.AppTheme_brown;
                break;
            default:
                Constant.theme = R.style.AppTheme;
                break;
        }
    }
}
