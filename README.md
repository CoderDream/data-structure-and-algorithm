# lagou-edu-101-datastructure
185_重学数据结构与算法



[MinGW-w64 离线包安装方法](https://blog.csdn.net/weixin_36466834/article/details/119569365)

[MinGW-w64离线安装，测试可用](https://blog.csdn.net/ZHAOJUNWEI08/article/details/86602120)



[Clion的安装和配置（C/C++开发神器）](https://blog.csdn.net/qq_44723773/article/details/104698675)

[windows上安装CLion教程及简单使用](https://www.cnblogs.com/attentle/p/12652512.html)



[Windows10下的CLion控制台中文乱码终极解决方案](https://blog.csdn.net/YK_LaNce/article/details/100038041)



### 参考文档

* 1.[C++类的大小——sizeof(class) ](https://www.cnblogs.com/ZY-Dream/p/10016731.html)
* [在-Clion-中使用-Google-Test](https://superlova.github.io/2021/05/01/%E3%80%90%E5%AD%A6%E4%B9%A0%E7%AC%94%E8%AE%B0%E3%80%91%E5%9C%A8-Clion-%E4%B8%AD%E4%BD%BF%E7%94%A8-Google-Test/)
* [CLion 一个项目内使用多个 cpp 源文件的方法](https://blog.csdn.net/weixin_43848437/article/details/107397445)
* [单元测试：从0到1学习gtest(CLion)](https://blog.csdn.net/zhizhengguan/article/details/110313265)
* [玩转Google开源C++单元测试框架Google Test系列(gtest)(总)](https://www.cnblogs.com/coderzh/archive/2009/04/06/1426755.html)



* 换1.10版本可以解决

```
D:\CLion_2021.2.2\bin\cmake\win\bin\cmake.exe -DCMAKE_BUILD_TYPE=Debug -DCMAKE_DEPENDS_USE_COMPILER=FALSE -G "CodeBlocks - MinGW Makefiles" C:\Users\ccc\CLionProjects\Auto_arr
CMake Warning at googletest/CMakeLists.txt:54 (project):
  VERSION keyword not followed by a value or was followed by a value that
  expanded to nothing.


-- Could NOT find Python (missing: Python_EXECUTABLE Interpreter) 
CMake Error at googletest/CMakeLists.txt:132 (set_target_properties):
  set_target_properties called with incorrect number of arguments.


CMake Error at googletest/CMakeLists.txt:134 (set_target_properties):
  set_target_properties called with incorrect number of arguments.


-- Configuring incomplete, errors occurred!
See also "C:/Users/ccc/CLionProjects/Auto_arr/cmake-build-debug/CMakeFiles/CMakeOutput.log".

[Finished]

```





```
====================[ Build | add | Debug ]=====================================
D:\CLion_2021.2.2\bin\cmake\win\bin\cmake.exe --build C:\Users\ccc\CLionProjects\Auto_arr\cmake-build-debug --target add -- -j 12
Scanning dependencies of target add
[ 50%] Building CXX object CMakeFiles/add.dir/add.cpp.obj
[100%] Linking CXX executable add.exe
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test1_Test::TestBody()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:15: undefined reference to `testing::Message::Message()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:15: undefined reference to `testing::internal::AssertHelper::AssertHelper(testing::TestPartResult::Type, char const*, int, char const*)'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:15: undefined reference to `testing::internal::AssertHelper::operator=(testing::Message const&) const'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:15: undefined reference to `testing::internal::AssertHelper::~AssertHelper()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:15: undefined reference to `testing::internal::AssertHelper::~AssertHelper()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test2_Test::TestBody()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:19: undefined reference to `testing::Message::Message()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:19: undefined reference to `testing::internal::AssertHelper::AssertHelper(testing::TestPartResult::Type, char const*, int, char const*)'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:19: undefined reference to `testing::internal::AssertHelper::operator=(testing::Message const&) const'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:19: undefined reference to `testing::internal::AssertHelper::~AssertHelper()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:19: undefined reference to `testing::internal::AssertHelper::~AssertHelper()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test3_Test::TestBody()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:23: undefined reference to `testing::Message::Message()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:23: undefined reference to `testing::internal::AssertHelper::AssertHelper(testing::TestPartResult::Type, char const*, int, char const*)'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:23: undefined reference to `testing::internal::AssertHelper::operator=(testing::Message const&) const'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:23: undefined reference to `testing::internal::AssertHelper::~AssertHelper()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:23: undefined reference to `testing::internal::AssertHelper::~AssertHelper()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `main':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:27: undefined reference to `testing::InitGoogleTest(int*, char**)'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `__static_initialization_and_destruction_0':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:14: undefined reference to `testing::internal::GetTestTypeId()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:14: undefined reference to `testing::internal::MakeAndRegisterTestInfo(char const*, char const*, char const*, char const*, testing::internal::CodeLocation, void const*, void (*)(), void (*)(), testing::internal::TestFactoryBase*)'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:18: undefined reference to `testing::internal::GetTestTypeId()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:18: undefined reference to `testing::internal::MakeAndRegisterTestInfo(char const*, char const*, char const*, char const*, testing::internal::CodeLocation, void const*, void (*)(), void (*)(), testing::internal::TestFactoryBase*)'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:22: undefined reference to `testing::internal::GetTestTypeId()'
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:22: undefined reference to `testing::internal::MakeAndRegisterTestInfo(char const*, char const*, char const*, char const*, testing::internal::CodeLocation, void const*, void (*)(), void (*)(), testing::internal::TestFactoryBase*)'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test1_Test::TestCase_test1_Test()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:14: undefined reference to `testing::Test::Test()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test2_Test::TestCase_test2_Test()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:18: undefined reference to `testing::Test::Test()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test3_Test::TestCase_test3_Test()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:22: undefined reference to `testing::Test::Test()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `testing::internal::SuiteApiResolver<testing::Test>::GetSetUpCaseOrSuite(char const*, int)':
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:516: undefined reference to `testing::internal::IsTrue(bool)'
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:516: undefined reference to `testing::internal::GTestLog::GTestLog(testing::internal::GTestLogSeverity, char const*, int)'
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:516: undefined reference to `testing::internal::GTestLog::~GTestLog()'
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:516: undefined reference to `testing::internal::GTestLog::~GTestLog()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `testing::internal::SuiteApiResolver<testing::Test>::GetTearDownCaseOrSuite(char const*, int)':
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:531: undefined reference to `testing::internal::IsTrue(bool)'
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:531: undefined reference to `testing::internal::GTestLog::GTestLog(testing::internal::GTestLogSeverity, char const*, int)'
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:531: undefined reference to `testing::internal::GTestLog::~GTestLog()'
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/internal/gtest-internal.h:531: undefined reference to `testing::internal::GTestLog::~GTestLog()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `testing::AssertionResult testing::internal::CmpHelperEQ<int, int>(char const*, char const*, int const&, int const&)':
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/gtest.h:1528: undefined reference to `testing::AssertionSuccess()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `testing::AssertionResult testing::internal::CmpHelperEQFailure<int, int>(char const*, char const*, int const&, int const&)':
C:/Users/ccc/CLionProjects/Auto_arr/googletest/include/gtest/gtest.h:1511: undefined reference to `testing::internal::EqFailure(char const*, char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, bool)'
CMakeFiles\add.dir/objects.a(add.cpp.obj):add.cpp:(.rdata$_ZTV19TestCase_test3_Test[_ZTV19TestCase_test3_Test]+0x20): undefined reference to `testing::Test::SetUp()'
CMakeFiles\add.dir/objects.a(add.cpp.obj):add.cpp:(.rdata$_ZTV19TestCase_test3_Test[_ZTV19TestCase_test3_Test]+0x28): undefined reference to `testing::Test::TearDown()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test3_Test::~TestCase_test3_Test()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:22: undefined reference to `testing::Test::~Test()'
CMakeFiles\add.dir/objects.a(add.cpp.obj):add.cpp:(.rdata$_ZTV19TestCase_test2_Test[_ZTV19TestCase_test2_Test]+0x20): undefined reference to `testing::Test::SetUp()'
CMakeFiles\add.dir/objects.a(add.cpp.obj):add.cpp:(.rdata$_ZTV19TestCase_test2_Test[_ZTV19TestCase_test2_Test]+0x28): undefined reference to `testing::Test::TearDown()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test2_Test::~TestCase_test2_Test()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:18: undefined reference to `testing::Test::~Test()'
CMakeFiles\add.dir/objects.a(add.cpp.obj):add.cpp:(.rdata$_ZTV19TestCase_test1_Test[_ZTV19TestCase_test1_Test]+0x20): undefined reference to `testing::Test::SetUp()'
CMakeFiles\add.dir/objects.a(add.cpp.obj):add.cpp:(.rdata$_ZTV19TestCase_test1_Test[_ZTV19TestCase_test1_Test]+0x28): undefined reference to `testing::Test::TearDown()'
CMakeFiles\add.dir/objects.a(add.cpp.obj): In function `TestCase_test1_Test::~TestCase_test1_Test()':
C:/Users/ccc/CLionProjects/Auto_arr/add.cpp:14: undefined reference to `testing::Test::~Test()'
collect2.exe: error: ld returned 1 exit status
mingw32-make.exe[3]: *** [CMakeFiles\add.dir\build.make:95: add.exe] Error 1
mingw32-make.exe[2]: *** [CMakeFiles\Makefile2:185: CMakeFiles/add.dir/all] Error 2
mingw32-make.exe[1]: *** [CMakeFiles\Makefile2:192: CMakeFiles/add.dir/rule] Error 2
mingw32-make.exe: *** [Makefile:162: add] Error 2

```





```
C:\CLionProjects\Auto_arr\cmake-build-debug\Auto_arr.exe
[==========] Running 3 tests from 1 test suite.
[----------] Global test environment set-up.
[----------] 3 tests from TestCase
[ RUN      ] TestCase.test1
[       OK ] TestCase.test1 (0 ms)
[ RUN      ] TestCase.test2
[       OK ] TestCase.test2 (0 ms)
[ RUN      ] TestCase.test3
[       OK ] TestCase.test3 (0 ms)
[----------] 3 tests from TestCase (8 ms total)

[----------] Global test environment tear-down
[==========] 3 tests from 1 test suite ran. (15 ms total)
[  PASSED  ] 3 tests.
0

Process finished with exit code 0

```







### 安装步骤

* 1、先离线安装MinGW-w64
  * 解压 解压到xxx文件夹
  * 配置 path 增加 xxx/bin
  * 验证 cmd -> gcc -v -> g++ -v
* 2、安装CLion
  * 创建项目
  * 自动配置C++环境（第一步正确完成后，这一步会自动配置）

	



```c++
#include <iostream>

using namespace std;

/**
 * 自动数字类
 */
class Auto_arr {
public:
    // 构造函数
    Auto_arr(int length = 0);

    // 析构函数
    ~Auto_arr();

    int &operator[](int i);

    const int &operator[](int i) const;

    // 显示
    void display(int b);

    // 获取length
    int getLength();


private: // 私有属性
    // 长度
    int length;
    // 数组
    int *ptr_arr;

};

Auto_arr::Auto_arr(int length) {
    this->length = length;
    ptr_arr = new int[length];
}

Auto_arr::~Auto_arr() {
    delete[] ptr_arr;
}

/**
 * 取值
 * @param i
 * @return
 */
int &Auto_arr::operator[](int i) {
    return ptr_arr[i];
}

const int &Auto_arr::operator[](int i) const {
    return ptr_arr[i];
}

/**
 * 显示方法
 * @param b
 */
void Auto_arr::display(int b) {
    cout << ptr_arr[b];
}

/**
 * 获取长度
 */
int Auto_arr::getLength() {
    return length;
}

int main() {
    // 构造长度为10的数组
    Auto_arr A(10);
    // 打印类的sizeof 参考：https://www.cnblogs.com/huolong-blog/p/7587711.html
    cout << sizeof(Auto_arr) << endl;
    // 打印length
    cout << A.getLength() << endl;
    // 设置A[5]的值
    A[5] = 5;
    // 打印A[5]
    A.display(5);
    // 暂停
    system("pause");
    return 0;
}
```



