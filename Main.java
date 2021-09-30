import app.application.user.UserApplicationService;
import app.application.user.CreateUserCommand;
import app.application.user.GetAllUsersCommand;
import app.application.user.UserCollection;
import app.application.user.GetUserCommand;
import app.application.user.UserData;
import app.application.user.ChangeUserDetailCommand;
import app.application.user.DeleteUserCommand;
import app.domain.model.user.UserService;
import app.domain.model.user.IUserRepository;
import app.domain.model.user.UserFullSpecification;
import app.in_memory.user.InMemoryUserRepository;
import app.in_memory.user.InMemoryUserFactory;
import app.exception.user.CanNotCreateUserException;
import app.exception.user.CanNotUpdateUserException;
import app.console.Console;

public class Main
{
    // プレゼンテーション層
    public static void main(String args[]) {
        Console console = new Console();
        IUserRepository userRepository = new InMemoryUserRepository();
        UserFullSpecification userFullSpecification = new UserFullSpecification(userRepository);
        UserApplicationService userApplicationService = new UserApplicationService(
            new UserService(userRepository),
            new InMemoryUserFactory(),
            userRepository,
            userFullSpecification
        );

        try {
            // ユーザー作成
            CreateUserCommand createUserCommand = new CreateUserCommand("Igarashi", "Yuki");
            userApplicationService.createUser(createUserCommand);

            createUserCommand = new CreateUserCommand("Nakamura", "Ryota");
            userApplicationService.createUser(createUserCommand);

            createUserCommand = new CreateUserCommand("Shibata", "Emi");
            userApplicationService.createUser(createUserCommand);

            // ユーザー一覧取得
            GetAllUsersCommand getAllUsersCommand = new GetAllUsersCommand();
            UserCollection users = userApplicationService.getAllUsers(getAllUsersCommand);

            // ユーザー一覧表示
            console.printUsers(users);

            // ユーザー詳細表示
            GetUserCommand getUserCommand = new GetUserCommand(1);
            UserData user = userApplicationService.getUser(getUserCommand);

            console.printUser(user);

            // ユーザー詳細変更
            ChangeUserDetailCommand changeUserDetailCommand = new ChangeUserDetailCommand(1, "Kobayashi", "Yuki");
            userApplicationService.changeUserDetail(changeUserDetailCommand);

            // ユーザー詳細表示
            getUserCommand = new GetUserCommand(1);
            user = userApplicationService.getUser(getUserCommand);

            console.printUser(user);

            // ユーザー削除
            DeleteUserCommand deleteUserCommand = new DeleteUserCommand(1);
            userApplicationService.deleteUser(deleteUserCommand);

            // ユーザー一覧表示
            getAllUsersCommand = new GetAllUsersCommand();
            users = userApplicationService.getAllUsers(getAllUsersCommand);

            console.printUsers(users);

            // 上限を超えてユーザー作成
            createUserCommand = new CreateUserCommand("Iimura", "Tarou");
            userApplicationService.createUser(createUserCommand);

            createUserCommand = new CreateUserCommand("Nakaura", "Hitomi");
            userApplicationService.createUser(createUserCommand);

            createUserCommand = new CreateUserCommand("Amamori", "Yuta");
            userApplicationService.createUser(createUserCommand);

            createUserCommand = new CreateUserCommand("Kimura", "Saburou");
            userApplicationService.createUser(createUserCommand);

            // ユーザー一覧表示
            getAllUsersCommand = new GetAllUsersCommand();
            users = userApplicationService.getAllUsers(getAllUsersCommand);            
            console.printUsers(users);

        } catch (CanNotCreateUserException e) {
            console.printError(e);
            
        } catch (CanNotUpdateUserException e) {
            console.printError(e);
        }
    }
    
}