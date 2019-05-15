package hr.ferit.brunozoric.taskie.networking.interactors

import hr.ferit.brunozoric.taskie.model.BackendTask
import hr.ferit.brunozoric.taskie.model.request.AddTaskRequest
import hr.ferit.brunozoric.taskie.model.request.UserDataRequest
import hr.ferit.brunozoric.taskie.model.response.GetTasksResponse
import hr.ferit.brunozoric.taskie.model.response.LoginReponse
import hr.ferit.brunozoric.taskie.model.response.RegisterReponse
import retrofit2.Callback

interface TaskieInteractor {

    fun getTasks(taskieReponseCallback: Callback<GetTasksResponse>)

    fun register(request: UserDataRequest, registerCallback: Callback<RegisterReponse>)

    fun login(request: UserDataRequest, loginCallback: Callback<LoginReponse>)

    fun save(request: AddTaskRequest, saveCallback: Callback<BackendTask>)
}