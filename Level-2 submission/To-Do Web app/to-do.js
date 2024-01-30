function addTask() {
    const taskInput = document.getElementById('new-task');
    const taskList = document.getElementById('task-list');

    if (taskInput.value.trim() !== '') {
        const taskItem = document.createElement('div');
        taskItem.className = 'task';
        taskItem.innerHTML = `
            <span>${taskInput.value}</span>
            <button onclick="completeTask(this)">Complete</button>
        `;
        taskList.appendChild(taskItem);

        taskInput.value = ''; // Clear the input field
    }
}

function completeTask(button) {
    const taskItem = button.parentNode;
    taskItem.classList.toggle('completed');
}
