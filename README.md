# UI_Design
An ugly ui 
1、主界面：MainActivity
  基本上没什么缺的功能了...
2、主界面->拍照搜题：CameraActivity
  缺调用相机，缺调用相册，缺九宫格，可返回
3、拍照搜题->图片确认：CameraConfirmActivity
  缺裁剪，缺保存图片
4、图片确认->题目列表:SearchResultActivity
  缺调用搜索过程
5、题目列表->题目详情：DetailActivity
  缺个滚动框，下面的按钮皆无功能，按下效果的图片大概是该图片的名字后面加个2，似乎还需要一个再拍一题
6、主界面->用户界面：PersonActivity
  用户界面下面是个listview,可在其.java文件中扩展、添加功能。除反馈界面外其他界面暂缺
7、用户界面->反馈：FeedbackActivity
  缺加图片和提交功能
8、主界面->文本搜题：WordSearchActivity
  主要由Subject,SubjectAdapter,subject_list_item写成，暂将点击后的页面指向主界面，本应打开公式编辑器
9、主界面->历史收藏
   滑动可切换历史/收藏页面，但fragment里尚未给listview赋值
10、登录界面
